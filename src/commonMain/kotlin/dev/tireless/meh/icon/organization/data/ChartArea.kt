// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartArea: ImageVector
  get() {
    val current = _chartArea
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartArea",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m20.48 8.02 -7.03 -3.8 a2 2 0 0 0 -2.12 .2 L4 10 V2 H2 v26 a2 2 0 0 0 2 2 h26 V5.74Z M28 20.2 20.38 22 l-7.03 -2.88 a2 2 0 0 0 -2.02 .37 L4 25.84 v-4.46 l8.38 -9.4 7.01 5.62 a2 2 0 0 0 2.05 .21 l6.56 -3.2Z M12.52 5.98 l7.03 3.8 a2 2 0 0 0 1.34 .17 L28 8.26 v4.12 l-7.38 3.64 -7.02 -5.62 a2 2 0 0 0 -2.69 .26 L4 18.38 v-5.87Z M4.55 28 l8.07 -7.01 7.03 2.88 a2 2 0 0 0 1.15 .08 l7.2 -1.69 V28Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.48 8.02
          moveTo(x = 20.48f, y = 8.02f)
          // l -7.03 -3.8
          lineToRelative(dx = -7.03f, dy = -3.8f)
          // a 2 2 0 0 0 -2.12 0.2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.12f,
            dy1 = 0.2f,
          )
          // L 4 10
          lineTo(x = 4.0f, y = 10.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 26
          verticalLineToRelative(dy = 26.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 26
          horizontalLineToRelative(dx = 26.0f)
          // V 5.74z
          verticalLineTo(y = 5.74f)
          close()
          // M 28 20.2
          moveTo(x = 28.0f, y = 20.2f)
          // L 20.38 22
          lineTo(x = 20.38f, y = 22.0f)
          // l -7.03 -2.88
          lineToRelative(dx = -7.03f, dy = -2.88f)
          // a 2 2 0 0 0 -2.02 0.37
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.02f,
            dy1 = 0.37f,
          )
          // L 4 25.84
          lineTo(x = 4.0f, y = 25.84f)
          // v -4.46
          verticalLineToRelative(dy = -4.46f)
          // l 8.38 -9.4
          lineToRelative(dx = 8.38f, dy = -9.4f)
          // l 7.01 5.62
          lineToRelative(dx = 7.01f, dy = 5.62f)
          // a 2 2 0 0 0 2.05 0.21
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.05f,
            dy1 = 0.21f,
          )
          // l 6.56 -3.2z
          lineToRelative(dx = 6.56f, dy = -3.2f)
          close()
          // M 12.52 5.98
          moveTo(x = 12.52f, y = 5.98f)
          // l 7.03 3.8
          lineToRelative(dx = 7.03f, dy = 3.8f)
          // a 2 2 0 0 0 1.34 0.17
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.34f,
            dy1 = 0.17f,
          )
          // L 28 8.26
          lineTo(x = 28.0f, y = 8.26f)
          // v 4.12
          verticalLineToRelative(dy = 4.12f)
          // l -7.38 3.64
          lineToRelative(dx = -7.38f, dy = 3.64f)
          // l -7.02 -5.62
          lineToRelative(dx = -7.02f, dy = -5.62f)
          // a 2 2 0 0 0 -2.69 0.26
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.69f,
            dy1 = 0.26f,
          )
          // L 4 18.38
          lineTo(x = 4.0f, y = 18.38f)
          // v -5.87z
          verticalLineToRelative(dy = -5.87f)
          close()
          // M 4.55 28
          moveTo(x = 4.55f, y = 28.0f)
          // l 8.07 -7.01
          lineToRelative(dx = 8.07f, dy = -7.01f)
          // l 7.03 2.88
          lineToRelative(dx = 7.03f, dy = 2.88f)
          // a 2 2 0 0 0 1.15 0.08
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.15f,
            dy1 = 0.08f,
          )
          // l 7.2 -1.69
          lineToRelative(dx = 7.2f, dy = -1.69f)
          // V 28z
          verticalLineTo(y = 28.0f)
          close()
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
      .also { _chartArea = it }
  }

@Suppress("ObjectPropertyName")
private var _chartArea: ImageVector? = null
