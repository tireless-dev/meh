// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RetryFailed: ImageVector
  get() {
    val current = _retryFailed
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RetryFailed",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="26.41 25.0 30.0 21.41 28.59 20.0 25.0 23.59 21.41 20.0 20.0 21.41 23.59 25.0 20.0 28.59 21.41 30.0 25.0 26.41 28.59 30.0 30.0 28.59 26.41 25.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26.41 25
          moveTo(x = 26.41f, y = 25.0f)
          // L 30 21.41
          lineTo(x = 30.0f, y = 21.41f)
          // L 28.59 20
          lineTo(x = 28.59f, y = 20.0f)
          // L 25 23.59
          lineTo(x = 25.0f, y = 23.59f)
          // L 21.41 20
          lineTo(x = 21.41f, y = 20.0f)
          // L 20 21.41
          lineTo(x = 20.0f, y = 21.41f)
          // L 23.59 25
          lineTo(x = 23.59f, y = 25.0f)
          // L 20 28.59
          lineTo(x = 20.0f, y = 28.59f)
          // L 21.41 30
          lineTo(x = 21.41f, y = 30.0f)
          // L 25 26.41
          lineTo(x = 25.0f, y = 26.41f)
          // L 28.59 30
          lineTo(x = 28.59f, y = 30.0f)
          // L 30 28.59
          lineTo(x = 30.0f, y = 28.59f)
          // L 26.41 25z
          lineTo(x = 26.41f, y = 25.0f)
          close()
        }
        // M18 2 A12.04 12.04 0 0 0 6 14 v6.2 l-3.6 -3.6 L1 18 l6 6 6 -6 -1.4 -1.4 L8 20.2 V14 a10 10 0 0 1 20 0 v3 h2 v-3 A12.04 12.04 0 0 0 18 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 2
          moveTo(x = 18.0f, y = 2.0f)
          // A 12.04 12.04 0 0 0 6 14
          arcTo(
            horizontalEllipseRadius = 12.04f,
            verticalEllipseRadius = 12.04f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 14.0f,
          )
          // v 6.2
          verticalLineToRelative(dy = 6.2f)
          // l -3.6 -3.6
          lineToRelative(dx = -3.6f, dy = -3.6f)
          // L 1 18
          lineTo(x = 1.0f, y = 18.0f)
          // l 6 6
          lineToRelative(dx = 6.0f, dy = 6.0f)
          // l 6 -6
          lineToRelative(dx = 6.0f, dy = -6.0f)
          // l -1.4 -1.4
          lineToRelative(dx = -1.4f, dy = -1.4f)
          // L 8 20.2
          lineTo(x = 8.0f, y = 20.2f)
          // V 14
          verticalLineTo(y = 14.0f)
          // a 10 10 0 0 1 20 0
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 20.0f,
            dy1 = 0.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // A 12.04 12.04 0 0 0 18 2
          arcTo(
            horizontalEllipseRadius = 12.04f,
            verticalEllipseRadius = 12.04f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 18.0f,
            y1 = 2.0f,
          )
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
          horizontalLineToRelative(dx = -32.0f)
          close()
        }
      }.build()
      .also { _retryFailed = it }
  }

@Suppress("ObjectPropertyName")
private var _retryFailed: ImageVector? = null
