// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RequirementUsage: ImageVector
  get() {
    val current = _requirementUsage
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RequirementUsage",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M17.18 17.5 c0 -2.84 1.53 -4.68 4.16 -4.68 2.8 0 4.1 2.06 4.1 4.52 v.72 h-5.97 v.23 c0 1.29 .73 2.16 2.18 2.16 1.08 0 1.74 -.51 2.29 -1.22 l1.18 1.33 c-.74 1.01 -2.04 1.65 -3.71 1.65 -2.65 0 -4.23 -1.84 -4.23 -4.71 m2.29 -.93 v.14 h3.67 v-.16 c0 -1.24 -.63 -2.08 -1.77 -2.08 s-1.9 .86 -1.9 2.1 M9.27 22 H7 V10 h5.42 c2.18 0 3.54 1.44 3.54 3.71 0 1.65 -.76 2.9 -2.24 3.4 L16.18 22 h-2.53 l-2.23 -4.62 H9.27z m3.12 -6.53 c.88 0 1.41 -.48 1.41 -1.36 v-.8 c0 -.87 -.53 -1.33 -1.4 -1.33 H9.46 v3.49z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17.18 17.5
          moveTo(x = 17.18f, y = 17.5f)
          // c 0 -2.84 1.53 -4.68 4.16 -4.68
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -2.84f,
            dx2 = 1.53f,
            dy2 = -4.68f,
            dx3 = 4.16f,
            dy3 = -4.68f,
          )
          // c 2.8 0 4.1 2.06 4.1 4.52
          curveToRelative(
            dx1 = 2.8f,
            dy1 = 0.0f,
            dx2 = 4.1f,
            dy2 = 2.06f,
            dx3 = 4.1f,
            dy3 = 4.52f,
          )
          // v 0.72
          verticalLineToRelative(dy = 0.72f)
          // h -5.97
          horizontalLineToRelative(dx = -5.97f)
          // v 0.23
          verticalLineToRelative(dy = 0.23f)
          // c 0 1.29 0.73 2.16 2.18 2.16
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.29f,
            dx2 = 0.73f,
            dy2 = 2.16f,
            dx3 = 2.18f,
            dy3 = 2.16f,
          )
          // c 1.08 0 1.74 -0.51 2.29 -1.22
          curveToRelative(
            dx1 = 1.08f,
            dy1 = 0.0f,
            dx2 = 1.74f,
            dy2 = -0.51f,
            dx3 = 2.29f,
            dy3 = -1.22f,
          )
          // l 1.18 1.33
          lineToRelative(dx = 1.18f, dy = 1.33f)
          // c -0.74 1.01 -2.04 1.65 -3.71 1.65
          curveToRelative(
            dx1 = -0.74f,
            dy1 = 1.01f,
            dx2 = -2.04f,
            dy2 = 1.65f,
            dx3 = -3.71f,
            dy3 = 1.65f,
          )
          // c -2.65 0 -4.23 -1.84 -4.23 -4.71
          curveToRelative(
            dx1 = -2.65f,
            dy1 = 0.0f,
            dx2 = -4.23f,
            dy2 = -1.84f,
            dx3 = -4.23f,
            dy3 = -4.71f,
          )
          // m 2.29 -0.93
          moveToRelative(dx = 2.29f, dy = -0.93f)
          // v 0.14
          verticalLineToRelative(dy = 0.14f)
          // h 3.67
          horizontalLineToRelative(dx = 3.67f)
          // v -0.16
          verticalLineToRelative(dy = -0.16f)
          // c 0 -1.24 -0.63 -2.08 -1.77 -2.08
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.24f,
            dx2 = -0.63f,
            dy2 = -2.08f,
            dx3 = -1.77f,
            dy3 = -2.08f,
          )
          // s -1.9 0.86 -1.9 2.1
          reflectiveCurveToRelative(
            dx1 = -1.9f,
            dy1 = 0.86f,
            dx2 = -1.9f,
            dy2 = 2.1f,
          )
          // M 9.27 22
          moveTo(x = 9.27f, y = 22.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // V 10
          verticalLineTo(y = 10.0f)
          // h 5.42
          horizontalLineToRelative(dx = 5.42f)
          // c 2.18 0 3.54 1.44 3.54 3.71
          curveToRelative(
            dx1 = 2.18f,
            dy1 = 0.0f,
            dx2 = 3.54f,
            dy2 = 1.44f,
            dx3 = 3.54f,
            dy3 = 3.71f,
          )
          // c 0 1.65 -0.76 2.9 -2.24 3.4
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.65f,
            dx2 = -0.76f,
            dy2 = 2.9f,
            dx3 = -2.24f,
            dy3 = 3.4f,
          )
          // L 16.18 22
          lineTo(x = 16.18f, y = 22.0f)
          // h -2.53
          horizontalLineToRelative(dx = -2.53f)
          // l -2.23 -4.62
          lineToRelative(dx = -2.23f, dy = -4.62f)
          // H 9.27z
          horizontalLineTo(x = 9.27f)
          close()
          // m 3.12 -6.53
          moveToRelative(dx = 3.12f, dy = -6.53f)
          // c 0.88 0 1.41 -0.48 1.41 -1.36
          curveToRelative(
            dx1 = 0.88f,
            dy1 = 0.0f,
            dx2 = 1.41f,
            dy2 = -0.48f,
            dx3 = 1.41f,
            dy3 = -1.36f,
          )
          // v -0.8
          verticalLineToRelative(dy = -0.8f)
          // c 0 -0.87 -0.53 -1.33 -1.4 -1.33
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.87f,
            dx2 = -0.53f,
            dy2 = -1.33f,
            dx3 = -1.4f,
            dy3 = -1.33f,
          )
          // H 9.46
          horizontalLineTo(x = 9.46f)
          // v 3.49z
          verticalLineToRelative(dy = 3.49f)
          close()
        }
        // M21 30 H11 c-4.96 0 -9 -4.04 -9 -9 V11 c0 -4.96 4.04 -9 9 -9 h10 c4.96 0 9 4.04 9 9 v10 c0 4.96 -4.04 9 -9 9 M11 4 a7 7 0 0 0 -7 7 v10 a7 7 0 0 0 7 7 h10 a7 7 0 0 0 7 -7 V11 a7 7 0 0 0 -7 -7z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 30
          moveTo(x = 21.0f, y = 30.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // c -4.96 0 -9 -4.04 -9 -9
          curveToRelative(
            dx1 = -4.96f,
            dy1 = 0.0f,
            dx2 = -9.0f,
            dy2 = -4.04f,
            dx3 = -9.0f,
            dy3 = -9.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // c 0 -4.96 4.04 -9 9 -9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -4.96f,
            dx2 = 4.04f,
            dy2 = -9.0f,
            dx3 = 9.0f,
            dy3 = -9.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // c 4.96 0 9 4.04 9 9
          curveToRelative(
            dx1 = 4.96f,
            dy1 = 0.0f,
            dx2 = 9.0f,
            dy2 = 4.04f,
            dx3 = 9.0f,
            dy3 = 9.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // c 0 4.96 -4.04 9 -9 9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 4.96f,
            dx2 = -4.04f,
            dy2 = 9.0f,
            dx3 = -9.0f,
            dy3 = 9.0f,
          )
          // M 11 4
          moveTo(x = 11.0f, y = 4.0f)
          // a 7 7 0 0 0 -7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = 7.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // a 7 7 0 0 0 7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.0f,
            dy1 = 7.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // a 7 7 0 0 0 7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.0f,
            dy1 = -7.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // a 7 7 0 0 0 -7 -7z
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = -7.0f,
          )
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _requirementUsage = it }
  }

@Suppress("ObjectPropertyName")
private var _requirementUsage: ImageVector? = null
