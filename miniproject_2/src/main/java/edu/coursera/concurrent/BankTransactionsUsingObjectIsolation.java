package edu.coursera.concurrent;

import static edu.rice.pcdp.PCDP.isolated;

/**
 * A thread-safe transaction implementation using object-based isolation.
 */
public final class BankTransactionsUsingObjectIsolation
        extends ThreadSafeBankTransaction {
    /**
     * {@inheritDoc}
     */
    @Override
    public void issueTransfer(final int amount, final Account src,
            final Account dst) {
        /*
         * TODO implement issueTransfer using object-based isolation instead of
         * global isolation, based on the reference code provided in
         * BankTransactionsUsingGlobalIsolation. Keep in mind that isolation
         * must be applied to both src and dst.
         */
        isolated(src, dst, () -> {
            if (src.withdraw(amount)) {
                dst.deposit(amount);
            }
        });

        // isolated --> Critical Section , only One Thread can enter Isolated Code Section
        // thus Avoiding stale Reads by other threads and data Races
    }
}
